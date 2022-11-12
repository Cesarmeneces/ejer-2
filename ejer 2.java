import javax.swing.JOptionPane;

class CalculoIMC{
  public static void main(String[] args) {
    //... falta más código por escribir
  }
}

//aqui esta la clase Persona
class Persona{
//atributos de la clase
  public String nombre;
  public int edad;
  public double peso,talla;
  //...
}
Persona asignar(String n,int e,double p,double t){
  nombre=n;
  edad=e;
  peso=p;
  talla=t;
  return this;
}
public double imc(){
  return peso/(talla*talla);
}
String cad="";
if(imc()<16.00){
  cad="Infrapeso: Delgadez Severa";
}else if(imc()<=16.00 || imc()<=16.99){
  cad="Infrapeso: Delgadez moderada";
}else if(imc()<=17.00 ||imc()<=18.49){
  cad="Infrapeso: Delgadez aceptable";
}else if(imc()<=18.50 || imc()<=24.99){
  cad="Peso Normal";
}else if(imc()<=25.00 || imc()<=29.99){
  cad="Sobrepeso";
}else if(imc()<=30.00 || imc()<=34.99){
  cad="Obeso: Tipo I";
}else if(imc()<=35.00 || imc()=40.00){
  cad="Obeso: Tipo III";
}else{
  cad="no existe clasificacion";
}
  return cad;
Persona verDatos(){
  String res="Datos\n";
  res+="\nnombre: "+nombre;
  res+="\nedad: "+edad;
  res+="\npeso: "+peso;
  res+="\ntalla: "+talla;
  res+="\nIMC obtenido es: "+imc();
  res+="\nClasificacion obtenida es: "+clasificacion();
  JOptionPane.showMessageDialog(null, res,"Resultado",JOptionPane.PLAIN_MESSAGE,new ImageIcon("ferd.jpg"));
  return this;
}
