package bankpackage;

import java.util.Objects;

public class User {
int acNo;
int name;
public User(int acNo, int name) {
	super();
	this.acNo = acNo;
	this.name = name;
}
public int getAcNo() {
	return acNo;
}
public void setAcNo(int acNo) {
	this.acNo = acNo;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
@Override
public int hashCode() {
	return Objects.hash(acNo, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return acNo == other.acNo && name == other.name;
}


}