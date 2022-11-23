package creational.builder;

import lombok.Getter;

@Getter
public class NewDatabase {
    private String name;
    private String host;
    private String password;
    private Integer port;
    private DatabaseType type;

    // Step 1 - hide the ctor
    private NewDatabase() {}

    @Override
    public String toString() {
        return "NewDatabase{" +
                "name='" + name + '\'' +
                ", host='" + host + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", type=" + type +
                '}';
    }

    // Utility method -  get Builder object
    public static NewDatabaseBuilder builder() {
        return  new NewDatabaseBuilder();
    }

    // Step 2- inner static class
    public static class NewDatabaseBuilder {
        NewDatabase newdb;

        public NewDatabaseBuilder() {
            newdb = new NewDatabase();
        }

        // Step 3- create setters / fluent interfaces / chaining setters
        public NewDatabaseBuilder withName(String name) {
            newdb.name=name;
            return this;
        }
        public NewDatabaseBuilder withUrl(String host, Integer port) {
            newdb.host=host;
            newdb.port=port;
            return this;
        }
        public NewDatabaseBuilder withPassword(String password){
            newdb.password=password;
            return this;
        }
        public NewDatabaseBuilder mysql() {
            newdb.type = DatabaseType.MYSQL;
            return this;
        }
        // Step 5 - Add a validation method
        boolean isValid () {
            if(newdb.name==null) {
                return false;
            }
            return true;
        }
        // Step 4 - create build method
        public NewDatabase build() {
            if(!isValid()) {
                throw new RuntimeException("Invalid database configuration");
            }
            NewDatabase actualdb = new NewDatabase();
            actualdb.name= newdb.name;
            actualdb.host= newdb.host;
            actualdb.port= newdb.port;
            actualdb.password= newdb.password;
            actualdb.type=newdb.type;
            return  actualdb;
        }
    }
}
