package linksharing

class Resource {
String Summary
String Title
User CreatedBy
Date dateCreated
Date lastUpdated
static belongsTo=[topic:Topic]
    static constraints = {
    }
}
