@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
   	// Напиши код здесь
    assertEquals("Возраст человека старше или равен 18", true, isAdult);
}
