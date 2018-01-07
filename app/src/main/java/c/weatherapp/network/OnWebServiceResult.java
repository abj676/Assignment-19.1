package c.weatherapp.network;

import c.weatherapp.utils.CommonUtilities;

/**
 * Created by abhi on 7/1/18.
 */

public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}
