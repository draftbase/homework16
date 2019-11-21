package task1;


public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int results;

    public Player(String firstName, String lastName, int results) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", results=" + results +
                '}';
    }

    @Override
    public int compareTo(Player player){
        if (this.results > player.results){
            return 1;
        } else if (this.results < player.results){
            return -1;
        } else {
            return 0;
        }
    }
}
