package com.trc.dagger2.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by trc on 2018/4/19.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScoped {
}
