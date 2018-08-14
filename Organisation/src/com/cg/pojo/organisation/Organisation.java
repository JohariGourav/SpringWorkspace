package com.cg.pojo.organisation;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Organisation {

	String toString();

	String getName();

	void setName(String name);

	Address getAddress();

	void setAddress(Address address);

	double getMarketValue();

	void setMarketValue(double marketValue);

	LocalDate getEstablished();

	void setEstablished(LocalDate established);

	int getEmployeeCount();

	void setEmployeeCount(int employeeCount);

	Set<String> getGlobalPresence();

	void setGlobalPresence(Set<String> globalPresence);

	List<String> getBoardMembers();

	void setBoardMembers(List<String> boardMembers);

	Map<Integer, String> getProjectManager();

	void setProjectManager(Map<Integer, String> projectManager);

}