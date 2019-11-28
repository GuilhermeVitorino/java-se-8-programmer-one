package br.com.java8.certification.tests;

class TestConstructor {
	
	public TestConstructor(String string) {
        System.out.println("simple - string param");
    }
	
	public TestConstructor() {
        System.out.println("simple - no param");
    }
        
    public TestConstructor(int i) {
         this("teste"); //this() deve ser sempre a primeira função do construtor
    }
    
}
