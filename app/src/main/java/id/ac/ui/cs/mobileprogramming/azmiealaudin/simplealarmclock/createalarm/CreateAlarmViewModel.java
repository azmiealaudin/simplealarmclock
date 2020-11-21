package id.ac.ui.cs.mobileprogramming.azmiealaudin.simplealarmclock.createalarm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import id.ac.ui.cs.mobileprogramming.azmiealaudin.simplealarmclock.data.Alarm;
import id.ac.ui.cs.mobileprogramming.azmiealaudin.simplealarmclock.data.AlarmRepository;

public class CreateAlarmViewModel extends AndroidViewModel {
    private AlarmRepository alarmRepository;

    public CreateAlarmViewModel(@NonNull Application application) {
        super(application);

        alarmRepository = new AlarmRepository(application);
    }

    public void insert(Alarm alarm) {
        alarmRepository.insert(alarm);
    }
}
