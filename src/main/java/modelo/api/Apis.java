package modelo.api;

public class Apis {

    public static final String BASE_URL = "https://m5b.herokuapp.com/";

    /*
    public List<Cancion> cancionList(){

        try  {
            URL url = new URL(BASE_URL + "canciones/list");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");



            int responseCode = con.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Error: " + responseCode);
            }else{
                StringBuilder result = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    result.append(scanner.next());
                }

                scanner.close();

                System.out.println(result);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }*/



}
