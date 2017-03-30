package Library;

public class Author extends Human {
private String name;
private String secondname;
public Author(int height, int weight, int age, String name, String secondname) {
	super(height, weight, age);
	this.name = name;
	this.secondname = secondname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
@Override
public String toString() {
	return "name=" + name + ", secondname=" + secondname;
}

}
