package br.com.seniormind.alarmedevoz.presenter.viewmodel

import androidx.lifecycle.LiveData
import br.com.seniormind.alarmedevoz.data.entity.Alarm

interface ICreateAlarmViewModel {
    val state: LiveData<AlarmCommand>

    fun setSound(sound: String)
    fun setColor(color: Int)
    fun setTitle(title: String)
    fun setDays()
    fun saveAlarm()
    fun setDate(hour: Int, minute: Int)
}
