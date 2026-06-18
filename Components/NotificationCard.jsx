import {
  Card,
  CardContent,
  Typography,
  Chip
} from "@mui/material";

function NotificationCard({ notification }) {

  return (

    <Card sx={{ marginTop: 2 }}>

      <CardContent>

        <Chip
          label={notification.Type}
          sx={{ marginBottom: 1 }}
        />

        <Typography variant="h6">
          {notification.Message}
        </Typography>

        <Typography variant="body2">
          {notification.Timestamp}
        </Typography>

      </CardContent>

    </Card>

  );

}

export default NotificationCard;