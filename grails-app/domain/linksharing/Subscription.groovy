package linksharing

class Subscription {
Date dateCreated
static belongsTo=[user:User,topic:Topic]
    static constraints = {
    }
}
