package br.com.seniormind.alarmedevoz.presenter.viewmodel

import androidx.lifecycle.LiveData
import br.com.seniormind.alarmedevoz.data.entity.Alarm

interface IHomeViewModel {
    val state: LiveData<AlarmCommand>
    fun getAlarms()
    fun removeAlarm(alarm: Alarm)
}
