package com.example.cat2datedialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;
public class MyDateDialog extends DialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int months=c.get(Calendar.MONTH);
        int days=c.get(Calendar.DAY_OF_MONTH);
        int hr=c.get(Calendar.HOUR_OF_DAY);
        int min=c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog=new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), hr, min,
                DateFormat.is24HourFormat(getActivity()));

        return timePickerDialog;
    }
}