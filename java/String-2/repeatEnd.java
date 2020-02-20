public String repeatEnd(String str, int n) {
	
	String fin = str.substring(str.length() - n);
    StringBuffer resultado = new StringBuffer();
    
    for(int i = 0; i < n; i++)
        resultado.append(fin);

    return resultado.toString();
}