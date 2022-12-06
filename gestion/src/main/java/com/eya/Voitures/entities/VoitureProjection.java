package com.eya.Voitures.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomProd",types= {Voiture.class})
public interface VoitureProjection {
public String getNomVoiture();
}
