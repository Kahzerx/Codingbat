public String[] fizzBuzz(int start, int end) {
    String[] resultado = new String[end - start];

    for ( int i = 0; i < end - start; i++ ) {
        if ((i + start) % 15 == 0) resultado[i] = "FizzBuzz";
        else if ((i + start) % 3 == 0) resultado[i] = "Fizz";
        else if ((i + start) % 5 == 0) resultado[i] = "Buzz";
        else resultado[i] = String.valueOf(i + start);
    }
    return resultado;
}