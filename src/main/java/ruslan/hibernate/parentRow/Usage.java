package ruslan.hibernate.parentRow;

/**
 * Created by ruslan on 23.07.2017.
 */
public class Usage {

    static class ObjectFactory {
        public void save(Object o){};
    }

    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();


            MyRow parent = new MyRow();
            parent.setName("parent");


            MyRow child = new MyRow();
            child.setName("child");
            child.setParent(parent);


            MyRow child2 = new MyRow();
            child2.setName("child2");
            child2.setParent(child);


            objectFactory.save(child2);
            System.out.println("done");


//            output
//            id    name       parent_id
//            1     parent     null
//            2     child      1
//            3     cild       2

    }
}
