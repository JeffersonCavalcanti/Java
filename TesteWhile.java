name: Java CI

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3
      - name: Set up JDK 17
        uses: actions/setup-java@v3
        with:
          java-version: '17'
          distribution: 'temurin'
      - name: Build with Ant
        run: ant -noinput -buildfile build.xml
package sintaxe_variavel_e_fluxo;

public class TesteWhile {

	public static void main(String[] args) {
		
	int contador=0;
	while (contador <= 10) { 
	System.out.println(contador);
	//CONTADOR E IGUAL AO CONTADOR 
	
	contador ++;
	
		
		}
	}
}
