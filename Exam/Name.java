import Lessons.Constructor.Person.Person;

public class Name
{
    private String firstName;
    private String initial;
    private String lastName;

    public Name()
    {
        firstName = "";
        lastName = "";
        initial = "";
    }

    public Name(String fName, String initial, String lastName) {
        this.firstName = fName;
        this.lastName = lastName;
        this.initial = initial;
    }

    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString()
    {
        return (firstName + initial + lastName);
    }
   /* public boolean equals(Object obj)
    {
        Name n = (Name) obj;
        return (this.getFirstName() == n.getFirstName && this.getInitial() == n.getInitial() && this.getLastName == n.getLastName));
    }*/

    //Complete the toString and equals methods below

}