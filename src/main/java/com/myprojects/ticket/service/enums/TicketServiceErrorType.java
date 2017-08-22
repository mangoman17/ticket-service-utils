package com.myprojects.ticket.service.enums;

/**
 * This class contains all types of errors could occur in ticket-service
 */
public enum TicketServiceErrorType {
	DATA_BASE_ERROR,
	INVALID_NUM_SEATS,
	INVALID_EMAIL,
	SHOW_HOUSEFULL,
	NOT_ENOUGH_SEATS,
	SEAT_HOLD_TIMEOUT,
	SEAT_HOLD_DATA_LOCK,
	SEAT_HOLD_FAILED,
	SEAT_HOLD_ID_NOT_FOUND,
	SEAT_HOLD_EMAIL_NOT_MATCHING,
	SEAT_HOLD_EXPIRED,
	SEAT_HOLD_ALREADY_CONFIRMED,
	SEAT_HOLD_RESERVATION_TIMEOUT,
	EMAIL_SEND_ERRORS
}