package kr.ac.shinhan.csp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;



@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TeamMember {
	@PrimaryKey
	
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Long key; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialNum() {
		return socialNum;
	}

	public void setSocialNum(String socialNum) {
		this.socialNum = socialNum;
	}

	public Long getKey() {
		return key;
	}

	@Persistent
	private String name;
	
	@Persistent
	private String socialNum;
	
	public TeamMember(String name, String socialNum)
	{
		this.name = name;
		this.socialNum =socialNum;
	}
	

}
