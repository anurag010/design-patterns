package creational.builder;

import lombok.Getter;

@Getter
public class Database {
    private String name;
    private String host;
    private Integer port;
    private String password;
    private DatabaseType type;

    // Step 1 - hide the ctor
    private Database() {}

    // Utility method - getBuilder
    public static DatabaseBuilder builder() {

        return new DatabaseBuilder();
    }

    // Step 2 - create the inner static Builder class
    public static class DatabaseBuilder {
        // Step 3 - copy all fields from outer class in inner static class
        private String name;
        private String host;
        private Integer port;
        private String password;
        private DatabaseType type;

        // Step 4 - create setter for builder class / ctor chaining / fluent interfaces
        public DatabaseBuilder withName(String name) {
            this.name=name;
            return this;
        }
        public DatabaseBuilder withUrl(String host,Integer port) {
            this.host=host;
            this.port=port;
            return this;
        }
        public DatabaseBuilder withPassword(String password) {
            this.password=password;
            return this;
        }
        public DatabaseBuilder mysql() {
            this.type=DatabaseType.MYSQL;
            return this;
        }
        // Step 5 - create build method
        public Database build() {
            Database database =new Database();
            database.host=this.host;
            database.port=this.port;
            database.name=this.name;
            database.password=this.password;
            database.type=this.type;
            return database;
        }
    }
}
