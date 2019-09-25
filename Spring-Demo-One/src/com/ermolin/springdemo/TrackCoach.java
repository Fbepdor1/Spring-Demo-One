package com.ermolin.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	//ad an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside the method doMyStartupStuff");
	}
	
	//add distroy method
	
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside the method doMyCleanupStuffYoYo");
	}

}
