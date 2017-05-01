package com.hclamerica.challenge2;

import java.util.ArrayList;
import java.util.List;

public class UserDataAccess {
	
	private List<UserProfile> userProfiles;
	
	public UserDataAccess() {
		super();
		if(userProfiles == null)
		{
			userProfiles = new ArrayList<UserProfile>();
			loadTestData();
		}
	}
	
	private void loadTestData()
	{
		// Loading some dummy data of user profiles
		userProfiles.add(new UserProfile(1L, "User1","234-343-2343", new Address("234 ST, Apt #12","CALIFORNIA","34323","USA")));
		userProfiles.add(new UserProfile(2L, "User2","234-343-2344", new Address("234 ST, Apt #13","CALIFORNIA","34323","USA")));
		userProfiles.add(new UserProfile(3L, "User3","234-343-2345", new Address("234 ST, Apt #14","CALIFORNIA","34323","USA")));
		userProfiles.add(new UserProfile(4L, "User4","234-343-2346", new Address("234 ST, Apt #15","CALIFORNIA","34323","USA")));
	}
	
	public static void main(String[] args) throws Exception {
		Long id = 4L;
		UserDataAccess userDataAccess= new UserDataAccess();
		UserProfile userProfile = userDataAccess.getUserById(id);
		if(userProfile == null)
			throw new Exception("User profile not found for Id '"+id+"'");
		
		System.out.println(userProfile.getName());
		System.out.println(userProfile.getPhone());
		System.out.println(userProfile.getAddress().getAdressLine());
		System.out.println(userProfile.getAddress().getState());
		System.out.println(userProfile.getAddress().getZipCode());
		System.out.println(userProfile.getAddress().getCounty());
	}
	
	public UserProfile getUserById(Long id)
	{
		UserProfile userProfile = userProfiles.get(userProfiles.indexOf(new UserProfile(2L)));
		return userProfile;
	}

}
