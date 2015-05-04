package linksharing

class User {
String FirstName
String email
String username
String password
String Confirm_password
String lastName
byte[] photo
Boolean admin
Boolean active
Date dateCreated
Date lastUpdated

static hasMany=[topic:Topic,subscription:Subscription,resource:Resource]
    static constraints = {
    }
}
