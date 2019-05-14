package elastic.test.elasticsearch.common.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import elastic.test.elasticsearch.common.model.EsBaseBean;

@Document(indexName = "bank", type = "employee")
public class TestBO extends EsBaseBean{
	
	public TestBO() {}
	
	@Id
	@Field(type = FieldType.String, store = true)
	private String id;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Field(type = FieldType.Integer, store = true)
	private Integer account_number;
	
	@Field(type = FieldType.Integer, store = true)
	private Integer balance;
	
	@Field(type = FieldType.String, store = true)
	private String firstname;
	
	@Field(type = FieldType.String, store = true)
	private String lastname;
	
	@Field(type = FieldType.Integer, store = true)
	private Integer age;
	
	@Field(type = FieldType.String, store = true)
	private String gender;
	
	@Field(type = FieldType.String, store = true)
	private String address;
	
	@Field(type = FieldType.String, store = true)
	private String employer;
	
	@Field(type = FieldType.String, store = true)
	private String email;
	
	@Field(type = FieldType.String, store = true)
	private String city;
	
	@Field(type = FieldType.String, store = true)
	private String state;

	public Integer getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
