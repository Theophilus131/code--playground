from datetime import datetime, timedelta

def calculate_dates():
    print("Menstrual Cycle Calculator\n")

    # Get user input
    lmp_input = input("Enter the first day of your last period (YYYY-MM-DD): ")
    cycle_length = int(input("Enter your average cycle length in days (e.g., 28): "))

    try:
        lmp_date = datetime.strptime(lmp_input, "%Y-%m-%d")
    except ValueError:
        print("Invalid date format. Use YYYY-MM-DD.")
        return

    # Calculate next period
    next_period = lmp_date + timedelta(days=cycle_length)

    # Ovulation is approx. 14 days before next period
    ovulation_day = next_period - timedelta(days=14)

    # Fertile window: 3 days before to 2 days after ovulation
    fertile_start = ovulation_day - timedelta(days=3)
    fertile_end = ovulation_day + timedelta(days=2)

    # Safe period: before fertile_start and after fertile_end
    safe_start1 = lmp_date
    safe_end1 = fertile_start - timedelta(days=1)

    safe_start2 = fertile_end + timedelta(days=1)
    safe_end2 = next_period - timedelta(days=1)

    print("\n📅 Calculation Results:")
    print(f"Next Period Date: {next_period.date()}")
    print(f"Ovulation Date: {ovulation_day.date()}")
    print(f"Fertile Window: {fertile_start.date()} to {fertile_end.date()}")
    print(f"Safe Periods: {safe_start1.date()} to {safe_end1.date()} AND {safe_start2.date()} to {safe_end2.date()}")

if __name__ == "__main__":
    calculate_dates()
