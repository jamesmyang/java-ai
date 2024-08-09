package com.atucity.ai.keras.layers.core;

import com.atucity.ai.keras.activations.Activation;
import com.atucity.ai.keras.activations.Activations;
import com.atucity.ai.keras.layers.Layer;

public class Dense extends Layer {

    protected int units;

    protected Activation activation;

    protected boolean useBias;

    public Dense(int units, String activation, boolean useBias) {
        this.units = units;
        this.activation = Activations.get(activation);

        this.useBias = useBias;



    }
}
