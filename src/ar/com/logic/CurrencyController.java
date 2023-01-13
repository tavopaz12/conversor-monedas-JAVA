package ar.com.logic;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import java.util.*;
import org.json.JSONObject;

public class CurrencyController {

    public Map<String, String> getCurrenciesMap() {

        Map<String, String> currencyNames = new HashMap<>();

        JSONObject jsonObject = Service.getAvailableCurrencies();

        jsonObject.keySet().forEach(key -> {
            String value = jsonObject.getString(key);
            currencyNames.put(key, value);
        });

        Map<String, String> treeMap = new TreeMap<>(currencyNames);

        return treeMap;
    }

    public String[] getCodes() {
        ArrayList<String> listaTemp = new ArrayList<>();

        getCurrenciesMap().forEach((code, description) -> {
            String completeCurrency = code;
            listaTemp.add(completeCurrency);
        });

        String[] lista = listaTemp.toArray(new String[0]);
        return lista;
    }

    public String[] getCodeWithDescription() {
        ArrayList<String> listaTemp = new ArrayList<>();

        getCurrenciesMap().forEach((code, description) -> {
            String completeCurrency = code + "(" + description + ")";
            listaTemp.add(completeCurrency);
        });

        String[] lista = listaTemp.toArray(new String[0]);
        return lista;
    }

    public int getCurrencyIndexByCode(String code) {
        String[] currenciesList = getCodeWithDescription();
        String description = getCurrenciesMap().get(code);
        String completeCurrency = code + "(" + description + ")";

        for (int i = 0; i < currenciesList.length; i++) {
            if (currenciesList[i].equals(completeCurrency)) {
                return i;
            }
        }
        return 0;
    }

    public List<String> convertCurrency(String from, String to, String amount) {

        JSONObject responseObject = Service.getConvertion(from, to, amount);

        String oldAmount = Double.toString(responseObject.getDouble("old_amount"));
        String oldCurrency = responseObject.getString("old_currency");
        String newAmount = Double.toString(responseObject.getDouble("new_amount"));
        String newCurrency = responseObject.getString("new_currency");

        return new ArrayList<>(Arrays.asList(oldAmount, oldCurrency, newAmount, newCurrency));

    }

}
