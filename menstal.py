from datetime import date, timedelta

def is_valid_date(year, month, day):
    try:
        date(year, month, day)
        return True
    except ValueError:
        return False

def begin(year, month, day):
    return f"Your cycle starts on {date(year, month, day)}"

def flowDate(year, month, day):
    start_date = date(year, month, day)
    stop_date = start_date + timedelta(days=5)
    return f"Your flow starts on {start_date} and ends on {stop_date}"

def finish(year, month, day, cycle):
    end_date = date(year, month, day) + timedelta(days=cycle)
    return f"Your cycle ends on {end_date}"

def ovulation(year, month, day, cycle):
    start = date(year, month, day)
    end = start + timedelta(days=cycle)
    ov_start = end - timedelta(days=16)
    ov_end = end - timedelta(days=12)
    return f"Your ovulation starts on {ov_start} and ends on {ov_end}"

def fertileLength(year, month, day, cycle):
    start = date(year, month, day)
    end = start + timedelta(days=cycle)
    fertile_start = end - timedelta(days=21)
    fertile_end = end - timedelta(days=12)
    return f"Your fertility period is from {fertile_start} to {fertile_end}"

def safeperiod(year, month, day, cycle):
    start = date(year, month, day)
    end = start + timedelta(days=cycle)
    fertile_start = end - timedelta(days=21)
    fertile_end = end - timedelta(days=12)
    return f"Safe period is all days except between {fertile_start} and {fertile_end}"


while True:
    try:
        print("\n Menstrual Cycle Tracker ")
        year = int(input("Enter the year (e.g., 2025): "))
        month = int(input("Enter the month (1-12): "))
        day = int(input("Enter the day (1-31): "))
        cycle_length = int(input("Enter your cycle length (e.g., 28): "))

        if not is_valid_date(year, month, day):
            print(" Invalid date. Please try again.\n")
            continue

        print("\n Here is your menstral Result:")
        print(begin(year, month, day))
        print(flowDate(year, month, day))
        print(finish(year, month, day, cycle_length))
        print(ovulation(year, month, day, cycle_length))
        print(fertileLength(year, month, day, cycle_length))
        print(safeperiod(year, month, day, cycle_length))
	
        again = input("\nWould you like to check another cycle? (yes/no): ").lower()
        if again != 'yes':
            print("Goodbye! Stay healthy ")
            break

    except ValueError:
        print(" Please enter only whole numbers.\n")
