package  com.ttn.model;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class MainApp {
    private static final SessionFactory ourSessionFactory;


    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {

        System.out.println("Create");
        insertAuthorData();

        //     queryData();
//        System.out.println("Read");
        //  readAuthorData();
//        queryData();
//        System.out.println("Update");
//        updateAuthorData();
//        queryData();
//        System.out.println("Delete");
//           deleteData();
//          insertAuthorData();
//        queryData();

    }
    public static void queryData(){
        Session session = getSession();
        try  {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                //System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        }
        finally {

        }
    }

    public static void insertAuthorData() throws ParseException {



        User user = new User();
        user.setActive(true);
        user.setAdmin(false);
        user.setDateCreated(new SimpleDateFormat("dd-MM-yyyy").parse("26-12-1995"));
        user.setEmail("s1996jain@gmail.com");
        user.setFirstname("shubham");
        user.setLastname("jain");
        user.setUsername("shubhamjain123");
        user.setPassword("12345");


        TopicPerUser topicPerUser = new TopicPerUser();
        topicPerUser.setCreatedBy(user);
        topicPerUser.setName("Angularjs");

        Topic topic = new Topic();
        topic.setDateCreated(new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1996"));
        topic.setLastUpdated(new SimpleDateFormat("dd-MM-yyyy").parse("1-4-1996"));
        topic.setCreatedBy(user);
        topic.setName("Angularjs");

        Topic topic1  = new Topic();
        topic1.setDateCreated(new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1996"));
        topic1.setLastUpdated(new SimpleDateFormat("dd-MM-yyyy").parse("1-4-1996"));
        topic1.setCreatedBy(user);
        topic1.setName("Angularjs");




        Subscription subscription = new Subscription();
        subscription.setTopic(topic);
        subscription.setUser(user);
        subscription.setDateCreated(new SimpleDateFormat("dd-MM-yyyy").parse("30-03-1996"));

//        Book book = new Book();
//        book.setBookName("Cormen");
//        author.setBook(book);
//        author1.setBook(book);
            Session session = getSession();
            session.beginTransaction();

            //  session.save(author);
            //   session.save(author1);
            //  session.save(book);
            //  session.save(book1);
            //   session.save(book2);

            session.save(user);

            session.save(topic);
            session.save(subscription);


            session.getTransaction().commit();



    }

}