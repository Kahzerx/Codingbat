public String withoutString(String base, String remove) {

    String resultado = "";

    for (int i = 0; i < base.length(); i++) {

        if (i + remove.length() <= base.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) i += remove.length() - 1;

        else resultado += base.charAt(i);
    }

    return resultado;
}