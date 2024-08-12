package com.leopard2.game3;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }
}
