@groovy.transform.ToString
class Member {
    String name
    int age
}

def member = new Member()
member.name = "Erik Weibust"
member.age = 43

println member
