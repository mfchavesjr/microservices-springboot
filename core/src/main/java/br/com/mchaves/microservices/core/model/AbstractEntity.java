package br.com.mchaves.microservices.core.model;

import java.io.Serializable;

public interface AbstractEntity extends Serializable {
    Long getId();
}
