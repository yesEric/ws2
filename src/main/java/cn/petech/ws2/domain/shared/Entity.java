package cn.petech.ws2.domain.shared;

/**
 * Created by Eric on 2015-08-07.
 */
public interface Entity<T> {

    boolean sameIdentityAs(T other);
}
