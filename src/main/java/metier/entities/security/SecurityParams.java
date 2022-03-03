package metier.entities.security;

public interface SecurityParams {
    public static final String HEADER_STRING="Authorization";
    public static final String SECRET="fakri";
    public static final long EXPIRATION_TIME=10*24*3600;
    public static final String TOKEN_PREFIX="Bearer ";
}
