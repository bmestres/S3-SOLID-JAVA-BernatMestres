public class ServicePerson {

    private DataBase dataBase;

    public ServicePerson(DataBase currentDataBase){
        this.dataBase = currentDataBase;
    }

    public void savePerson(Person person) {
        this.dataBase.savePerson(person);
    }
}