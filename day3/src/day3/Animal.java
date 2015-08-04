package day3;

interface Animal {

	public  void makeSound();
	public  void getNoOfLegs();

}

interface EatingHabits
{
	public void getEatingHabit();
}

class Dog implements Animal, EatingHabits
{

	@Override
	public void getEatingHabit() {
		
		System.out.println("Both");
		
		
	}

	@Override
	public void makeSound() {
		System.out.println("Bark");
		
	}

	@Override
	public void getNoOfLegs() {
		System.out.println("four legs");
		
	}
	
	
}


class Snake implements Animal, EatingHabits
{

	@Override
	public void getEatingHabit() {
		System.out.println("Carnivo");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Hiss");
		
	}

	@Override
	public void getNoOfLegs() {
		System.out.println("Fourty legs");
		
	}
	
}

