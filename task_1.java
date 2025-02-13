@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);ь
        assertEquals("Ожидалось true, т.к. 19 больше 18.", true, isAdult); 
} 
