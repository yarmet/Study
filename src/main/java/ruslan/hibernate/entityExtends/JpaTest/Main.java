package ruslan.hibernate.entityExtends.JpaTest;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtility.getEntityManager();
        entityManager.getTransaction().begin();


        Mersedes car = new Mersedes();
        car.setName("sdfsdfsdf");
        car.setUniqueString("unique");

        entityManager.persist(car);
        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtility.close();
        System.out.println("Entity saved.");






    }

}
