package com.example.service;

import com.example.model.Barcode;
import com.example.repository.BaseRepository;

import java.util.List;

public class BarcodeService {
    private final BaseRepository<Barcode> barcodeBaseRepository;

    public BarcodeService(BaseRepository<Barcode> barcodeBaseRepository) {
        this.barcodeBaseRepository = barcodeBaseRepository;
    }

    public void addItemToDb(Barcode barcode) {
        barcodeBaseRepository.addItemToDb(barcode);
    }


    public void addItemsToDb(List<Barcode> barcodeList) {
        barcodeBaseRepository.addItemsToDb(barcodeList);
    }


    public Barcode getById(int id) {
        return barcodeBaseRepository.findById(id).orElseThrow(() -> new RuntimeException("Barcode not found!"));
    }

}
