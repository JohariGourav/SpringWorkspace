package com.cg.pojo.organisation;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrganisationImpl implements Organisation {

	private String name;
	private Address address;
	private double marketValue;
	private LocalDate established;
	private int employeeCount;
	private Set<String> globalPresence;
	private List<String> boardMembers;
	private Map<Integer, String> projectManager;

	public OrganisationImpl() {
	}

	public OrganisationImpl(String name, Address address, double marketValue, LocalDate established, int employeeCount,
			Set<String> globalPresence, List<String> boardMembers, Map<Integer, String> projectManager) {
		super();
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		this.established = established;
		this.employeeCount = employeeCount;
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManager = projectManager;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#toString()
	 */
	@Override
	public String toString() {
		return "Organisation [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", employeeCount=" + employeeCount + ", globalPresence=" + globalPresence
				+ ", boardMembers=" + boardMembers + ", projectManager=" + projectManager + "]";
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getAddress()
	 */
	@Override
	public Address getAddress() {
		return address;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setAddress(com.cg.pojo.organisation.Address)
	 */
	@Override
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getMarketValue()
	 */
	@Override
	public double getMarketValue() {
		return marketValue;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setMarketValue(double)
	 */
	@Override
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getEstablished()
	 */
	@Override
	public LocalDate getEstablished() {
		return established;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setEstablished(java.time.LocalDate)
	 */
	@Override
	public void setEstablished(LocalDate established) {
		this.established = established;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getEmployeeCount()
	 */
	@Override
	public int getEmployeeCount() {
		return employeeCount;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setEmployeeCount(int)
	 */
	@Override
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getGlobalPresence()
	 */
	@Override
	public Set<String> getGlobalPresence() {
		return globalPresence;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setGlobalPresence(java.util.Set)
	 */
	@Override
	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getBoardMembers()
	 */
	@Override
	public List<String> getBoardMembers() {
		return boardMembers;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setBoardMembers(java.util.List)
	 */
	@Override
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#getProjectManager()
	 */
	@Override
	public Map<Integer, String> getProjectManager() {
		return projectManager;
	}

	/* (non-Javadoc)
	 * @see com.cg.pojo.organisation.Organisation#setProjectManager(java.util.Map)
	 */
	@Override
	public void setProjectManager(Map<Integer, String> projectManager) {
		this.projectManager = projectManager;
	}

}
