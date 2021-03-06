package com.shadtaxi.shadtaxi.constants;

/**
 * Created by dennis on 07/11/17.
 */

public class Constants {
    public static final String BASE_URL = "http://34.239.109.128";
    public static final String REGISTRATION_URL = BASE_URL + "/api/user/register/";
    public static final String LOGIN_URL = BASE_URL + "/oauth/token";
    public static final String GET_USER = BASE_URL + "/api/user";
    public static final String GET_VEHICLE_TYPES = BASE_URL + "/api/app/load";
    public static final String UPDATE_PHOTO = BASE_URL + "/api/user/upload";
    public static final String UPDATE_PROFILE = BASE_URL + "/api/user/update";
    public static final String BECOME_DRIVER = BASE_URL + "/api/driver";
    public static final String TOGGLE_USER = BASE_URL + "/api/user";
    public static final String ADD_VEHICLE = BASE_URL + "/api/vehicle";
    public static final String GET_VEHICLES = BASE_URL + "/api/driver/vehicles";
    public static final String LOC_UPDATE = BASE_URL + "/api/driver/locupdate";
    public static final String NEAREST_DRIVERS = BASE_URL + "/api/driver/nearest";
    public static final String CREATE_REQUEST = BASE_URL + "/api/trip/create";
    public static final String PUSHER_APP_KEY = "08f56b364869ae010d7f";
    public static final String PUSHER_APP_CLUSTER = "mt1";
    public static final String PUSHER_AUTHENTICATOR = BASE_URL + "/broadcasting/auth";
}
