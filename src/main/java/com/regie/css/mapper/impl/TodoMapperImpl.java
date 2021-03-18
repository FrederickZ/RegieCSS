package com.regie.css.mapper.impl;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.regie.css.mapper.TodoMapper;
import com.regie.css.model.Todo;
import com.regie.css.util.MongoDBDataSource;
import com.regie.css.util.qo.Criteria;
import com.regie.css.util.qo.QueryObject;
import org.bson.Document;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class TodoMapperImpl implements TodoMapper {
    MongoDatabase database = MongoDBDataSource.getDatabase();
    MongoCollection<Document> collection = database.getCollection("todo");

    @Override
    public void insert(Todo todo) {
        Document document = prepareDocument(todo);
        collection.insertOne(document);
    }

    @Override
    public List<Todo> retrieve(QueryObject query) {
        List<Todo> todoList = new ArrayList<Todo>();
        Document document = prepareDocument(query);
        FindIterable<Document> resultIterable = collection.find(document);
        MongoCursor<Document> cur = resultIterable.iterator();
        while (cur.hasNext()) {
            Document doc = cur.next();
            Todo todo = new Todo(doc.getString("user"), doc.getString("content"));
            todoList.add(todo);
        }
        return todoList;
    }

    @Override
    public void delete(Todo todo) {
        Document document = prepareDocument(todo);
        collection.deleteOne(document);
    }

    private Document prepareDocument(Todo todo) {
        Document document = new Document()
                .append("user", todo.getUserID())
                .append("content", todo.getContent());
        return document;
    }

    private Document prepareDocument(QueryObject query) {
        Document document = new Document();
        for (Criteria criteria : query.getCriteriaList()) {
            document.append(criteria.getField(),
                    new Document(criteria.getOperator().getMongoDBOperator(), criteria.getValue())
            );
        }
        return document;
    }
}
