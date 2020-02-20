public String repeatFront(String str, int n) {
    StringBuffer resultado = new StringBuffer();//stringBuffer crea un buffer de string con la capacidad inicial de 16

    for(int i = n; i > 0; i--){
    	resultado.append(str.substring(0, i));
    }
    
    return resultado.toString();
}