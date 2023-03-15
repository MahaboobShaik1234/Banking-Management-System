package bankpackage;

import java.util.Objects;

public class Debit {
int cNo;
int  pin;
public Debit(int cNo, int pin) {
	super();
	this.cNo = cNo;
	this.pin = pin;
}
public int getcNo() {
	return cNo;
}
public void setcNo(int cNo) {
	this.cNo = cNo;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public int hashCode() {
	return Objects.hash(cNo, pin);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Debit other = (Debit) obj;
	return cNo == other.cNo && pin == other.pin;
}

}
