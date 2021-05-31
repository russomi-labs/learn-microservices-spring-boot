import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Your new challenge is', () => {
  render(<App />);
  const linkElement = screen.getByText(/Your new challenge is/i);
  expect(linkElement).toBeInTheDocument();
});
