package programacaoOrientadaObjeto.teoriaInterfaces.exercicios;

public record Square(double side) implements GeometricForm {
	
    public double getArea(){
        return side * side;
    }
}
